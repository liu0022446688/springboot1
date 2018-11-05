package cn.tx.ann_demo;

import org.springframework.stereotype.Component;

@Component
public class Bmw implements Car {
    @Override
    public void print() {
        System.out.print("wo shi baom che");
    }
}
