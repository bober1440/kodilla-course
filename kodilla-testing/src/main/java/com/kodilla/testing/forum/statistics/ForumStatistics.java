package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    public ForumStatistics forumStatistics;

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public ForumStatistics(ForumStatistics forumStatistics) {
        this.forumStatistics = forumStatistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averagePostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
        averageCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
        averageCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
    }

    public void showStatistics(){
        System.out.println("Number of Users: " + numberOfUsers);
        System.out.println("Number of Posts: " + numberOfPosts);
        System.out.println("Number of Comments: " + numberOfComments);

        if (numberOfUsers>0){
            System.out.println("Average Posts per User: " + averagePostsPerUser);
            System.out.println("Average Comments per User: " + averageCommentsPerUser);
        } else {
            System.out.println("There are no users of forum");
        }
        if(numberOfPosts > 0) {
            System.out.println("Average Posts per Post: " + averagePostsPerUser);
        }else{
            System.out.println("There are no posts of forum");
        }
    }
}
