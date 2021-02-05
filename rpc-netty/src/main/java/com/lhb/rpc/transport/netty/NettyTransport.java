package com.lhb.rpc.transport.netty;

import com.lhb.rpc.transport.Transport;
import com.lhb.rpc.transport.command.Command;

import java.nio.channels.Channel;
import java.util.concurrent.CompletableFuture;

/**
 * 使用netty框架发送请求
 * @author BruseLin
 */
public class NettyTransport implements Transport {

    private Channel channel;



    @Override
    public CompletableFuture<Command> send(Command request) {

        return null;
    }
}