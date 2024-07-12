package com.github.walkvoid.raft;

import sun.misc.Unsafe;

/**
 * @author walkvoid
 * @version 1.0
 * @date 2024/9/12
 * @desc
 */
public class RaftServer {
    private Configuration configuration;

    private volatile NodeState state;

    public void start(){
        //get config and connect cluster

        //


    }

    /**
     * Returns the current value of synchronization state.
     * This operation has memory semantics of a {@code volatile} read.
     * @return current state value
     */
    protected final NodeState getState() {
        return state;
    }

    /**
     * Sets the value of synchronization state.
     * This operation has memory semantics of a {@code volatile} write.
     * @param newState the new state value
     */
    protected final void setState(NodeState newState) {
        state = newState;
    }

    /**
     * Atomically sets synchronization state to the given updated
     * value if the current state value equals the expected value.
     * This operation has memory semantics of a {@code volatile} read
     * and write.
     *
     * @param expect the expected value
     * @param update the new value
     * @return {@code true} if successful. False return indicates that the actual
     *         value was not equal to the expected value.
     */
    protected final boolean compareAndSetState(NodeState expect, NodeState update) {
        return unsafe.compareAndSwapObject(this, stateOffset, expect, update);
    }


    private static final Unsafe unsafe = Unsafe.getUnsafe();
    private static final long stateOffset;
    static {
        try {
            stateOffset = unsafe.objectFieldOffset
                    (RaftServer.class.getDeclaredField("state"));
        } catch (Exception ex) { throw new Error(ex); }
    }
}
