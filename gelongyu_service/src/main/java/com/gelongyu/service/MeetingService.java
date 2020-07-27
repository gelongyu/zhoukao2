package com.gelongyu.service;

import com.gelongyu.bean.Meeting;
import com.gelongyu.bean.Meeting_type;

import java.util.List;

public interface MeetingService {

    List list();

    List<Meeting_type> bianyi();

    void add(Meeting meeting);

    Meeting hui(Meeting meeting);
}
