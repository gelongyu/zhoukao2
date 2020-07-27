package com.gelongyu.service.impl;

import com.gelongyu.bean.Meeting;
import com.gelongyu.bean.Meeting_type;
import com.gelongyu.dao.MeetingDao;
import com.gelongyu.service.MeetingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MeetingServiceImpl implements MeetingService {

    @Resource
    private MeetingDao meetingDao;
    @Override
    public List list() {
        return meetingDao.list();
    }

    @Override
    public List<Meeting_type> bianyi() {
        return meetingDao.bianyi();
    }

    @Override
    public void add(Meeting meeting) {
        meetingDao.add(meeting);
    }

    @Override
    public Meeting hui(Meeting meeting) {
        return meetingDao.hui(meeting);
    }
}
