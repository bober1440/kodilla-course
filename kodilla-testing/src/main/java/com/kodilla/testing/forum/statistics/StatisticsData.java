package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface StatisticsData {
    List<String> userNames();
    int postsCount();
    int commentsCount();
}
