package com.naraft.election;

/**
 * @author qingshan1993
 * @version 1.0
 * @date 2022/6/20
 * @desc 服务器节点状态
 */
public enum NodeState {

    FOLLOWER,

    CANDIDATE,

    LEADER,

}
