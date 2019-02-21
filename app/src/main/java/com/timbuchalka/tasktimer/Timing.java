package com.timbuchalka.tasktimer;

import android.util.Log;

import java.io.Serializable;
import java.util.Date;

/**
 * Simple timing object.
 * Sets it's start time when created, and calculates how long since creation,
 * when setDuration is called.
 */

class Timing implements Serializable {
    public static final long serialVersionUID = 20161120L;
    private static final String TAG = Timing.class.getSimpleName();

    private long m_Id;
    private Task mTask;
    private long mStartTime;
    private long mDuration;

    public Timing(Task taskId) {
        mTask = taskId;
        // Initialise the start time to now and the duration to zero for a new object.
        Date currentTime = new Date();
        mStartTime = currentTime.getTime() / 1000; // We are only tracking whole seconds, not milliseconds
        mDuration = 0;
    }

    long getId() {
        return m_Id;
    }

    void setId(long id) {
        m_Id = id;
    }

    Task getTaskId() {
        return mTask;
    }

    void setTaskId(Task taskId) {
        mTask = taskId;
    }

    long getStartTime() {
        return mStartTime;
    }

    void setStartTime(long startTime) {
        mStartTime = startTime;
    }

    long getDuration() {
        return mDuration;
    }

    void setDuration() {
        // Calculate the duration from mStartTime to dateTime.
        Date currentTime = new Date();
        mDuration = (currentTime.getTime() / 1000) - mStartTime; // Working in seconds, not milliseconds
        Log.d(TAG, mTask.getId() + " - Start time: " + mStartTime + " | Duration: " + mDuration);
    }
}
