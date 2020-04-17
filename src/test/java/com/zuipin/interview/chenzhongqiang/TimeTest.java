package com.zuipin.interview.chenzhongqiang;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TimeTest {
    @Test
    public void should_show_time_for_normal_str() {
        splitStringFormat("10:30~11:00","10:30");
        splitStringFormat("10:30~11:00","11:00");
    }

    @Test
    public void should_show_str_add_list_info() {



    }

    private void splitStringFormat(String strTime,String s) {
        assertThat(new TimeStr(strTime).first().toString(), is(s));
        assertThat(new TimeStr(strTime).first().toString(), is(s));
    }
}
