package com.zxc.grades.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PageResult<E> {
    private Long totals;
    private List<E> rows;


    public PageResult(long total, List<E> result) {
    }
}
