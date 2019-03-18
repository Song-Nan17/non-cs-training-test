package com.thoughtworks.training.test;

import com.thoughtworks.training.test.task5.Score;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Subject {

    /**
     * 两整数相加(环境验证)
     *
     * @param number1 整数1
     * @param number2 整数2
     * @return 输入的整数和
     */
    public static int solveTask0(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * 数组过滤及累加
     *
     * @param numbers 整数列表
     * @return 过滤累加结果
     */
    public static int solveTask1(int[] numbers) {
        return Arrays.stream(numbers).filter(number -> number % 2 == 0)
                .reduce(0, (num1, num2) -> num1 + num2);
    }

    /**
     * 根据输入的成绩单列表过滤及格的(60分及格线)成绩, 并输出成绩最高的成绩单姓名
     *
     * @param scores 成绩单列表
     * @return 成绩最高的成绩单姓名
     * @throws RuntimeException 如果没有及格的成绩单则抛出
     */
    public static String solveTask4(List<Score> scores) throws RuntimeException {
        String wanted = scores.stream().filter(score -> score.getScore() >= 60)
                .max(Comparator.comparing(ele -> ele.getScore())).get().getName();
        return Optional.ofNullable(wanted).orElseThrow(RuntimeException::new);
    }
}
