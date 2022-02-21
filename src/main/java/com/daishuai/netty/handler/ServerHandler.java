package com.daishuai.netty.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName ServerHandler
 * @Author daishuai
 * @Date 2022/2/20 16:42
 * @Version 1.0
 */
@Slf4j
public class ServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("ServerHandler channelActive >>>>>>>>>>>");
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        log.info("ServerHandler channelRegistered >>>>>>>>>>>");
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        log.info("ServerHandler handlerAdded >>>>>>>>>>>");
    }
}
