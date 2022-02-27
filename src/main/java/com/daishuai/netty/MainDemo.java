package com.daishuai.netty;

import io.netty.buffer.PooledByteBufAllocator;
import io.netty.util.internal.MathUtil;

/**
 * @ClassName MainDemo
 * @Author daishuai
 * @Date 2022/2/23 22:11
 * @Version 1.0
 */
public class MainDemo {

    public static void main(String[] args) {
        int size = MathUtil.safeFindNextPositivePowerOfTwo(32);
        System.out.println(size);
        int normalizedCapacity = 513;
        normalizedCapacity --;
        normalizedCapacity |= normalizedCapacity >>>  1;
        // 1000000001
        // 0100000000
        // 1100000001
        System.out.println(normalizedCapacity);
        normalizedCapacity |= normalizedCapacity >>>  2;
        // 1100000001
        // 0011000000
        // 1111000001
        System.out.println(normalizedCapacity);
        normalizedCapacity |= normalizedCapacity >>>  4;
        // 1111000001
        // 0000111100
        // 1111111101
        System.out.println(normalizedCapacity);
        normalizedCapacity |= normalizedCapacity >>>  8;
        // 1111111101
        // 0011111111
        // 1111111111
        System.out.println(normalizedCapacity);
        normalizedCapacity |= normalizedCapacity >>> 16;
        // 1111111111
        // 0000000000
        // 1111111111
        System.out.println(normalizedCapacity);
        normalizedCapacity ++;

        if (normalizedCapacity < 0) {
            normalizedCapacity >>>= 1;
        }
        System.out.println(normalizedCapacity);

        int reqCapacity = 33;
        if ((reqCapacity & 15) == 0) {
            System.out.println(reqCapacity);
        }
        System.out.println(~15);
        System.out.println((reqCapacity & ~15) + 16);

        // 0~16M
        //0~8M 8M~16M
        //0~4M 4M~8M 8~12M 12~16
        //0~2 2~4 4~8
        int page = 1024 * 8;
        PooledByteBufAllocator allocator = PooledByteBufAllocator.DEFAULT;
        allocator.directBuffer(16);
        //allocator.directBuffer(2 * page);
        // allocator.directBuffer(256 * page);
    }
}
