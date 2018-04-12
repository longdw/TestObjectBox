package com.test.objectbox;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by www.longdw.com on 2018/4/12 下午4:40.
 */
@Entity
public class TestObject {
    @Id
    private Long id;
}
