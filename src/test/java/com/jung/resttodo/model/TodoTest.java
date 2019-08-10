package com.jung.resttodo.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TodoTest {


    @Test
    public  void TodoCreated(){
        Todo todo = Todo.builder()
                .name("할인1")
                .desc("내용")
                .status(Status.READY)
                .build();
        assertThat(todo).isNotNull();
    }

}