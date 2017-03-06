package com.kruchkov.gradient;

import java.util.List;

interface AbstractMathFunction<T extends Number> {
    T f(List<T> args);
}