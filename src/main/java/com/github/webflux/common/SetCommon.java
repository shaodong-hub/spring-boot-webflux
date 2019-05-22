package com.github.webflux.common;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * <p>
 * 创建时间为 12:58 2019-05-21
 * 项目名称 spring-boot-webflux
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class SetCommon {

    @Bean
    public Map<String, Set<String>> getMap() {
        Map<String, Set<String>> map = new HashMap<>();
        for (int i = 0; i < 1200000; i++) {
            map.put(getRandomIp(), new HashSet<>());
        }
        return map;
    }





    public static String getRandomIp() {
        // 36.56.0.0-36.63.255.255
        // 61.232.0.0-61.237.255.255
        // 106.80.0.0-106.95.255.255
        // 121.76.0.0-121.77.255.255
        // 123.232.0.0-123.235.255.255
        // 139.196.0.0-139.215.255.255
        // 171.8.0.0-171.15.255.255
        // 182.80.0.0-182.92.255.255
        // 210.25.0.0-210.47.255.255
        // 222.16.0.0-222.95.255.255
        int[][] range = {{607649792, 608174079},
                {1038614528, 1039007743},
                {1783627776, 1784676351},
                {2035023872, 2035154943},
                {2078801920, 2079064063},
                {-1950089216, -1948778497},
                {-1425539072, -1425014785},
                {-1236271104, -1235419137},
                {-770113536, -768606209},
                {-569376768, -564133889},
        };

        Random random = new Random();
        int index = random.nextInt(10);
        return num2ip(range[index][0] + new Random().nextInt(range[index][1] - range[index][0]));
    }


    /*
     * 将十进制转换成IP地址
     */
    private static String num2ip(int ip) {

        int[] b = new int[4];
        String x = "";
        b[0] = ((ip >> 24) & 0xff);
        b[1] = ((ip >> 16) & 0xff);
        b[2] = ((ip >> 8) & 0xff);
        b[3] = (ip & 0xff);
        x = (b[0]) + "." + (b[1]) + "." + (b[2]) + "." + (b[3]);

        return x;
    }


}
