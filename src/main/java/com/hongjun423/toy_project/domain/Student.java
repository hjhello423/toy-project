package com.hongjun423.toy_project.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

import java.util.Random;

@ToString
public class Student {
    private String name;
    private int age;
    private String address;

    @JsonIgnore
    String[] nameList = {"kim", "choi", "lee", "jang", "yu", "han", "park", "son"};
    @JsonIgnore
    String[] addressList = {"경기도 성남시 분당구", "서울특별시 강남구", "서울 서초구", "서울 송파구", "경기도 하남시",
            "서울 관악구", "경기 광명시", "경기 부천시", "인천 계약구", "인천 중구", "인천 강화군", "경기 화성시", "경기 평택시", "경기 안성시"};

    public Student() {
        name = nameList[new Random().nextInt(nameList.length)];
        age = new Random().nextInt(100);
        address = addressList[new Random().nextInt(nameList.length)];

    }
}
