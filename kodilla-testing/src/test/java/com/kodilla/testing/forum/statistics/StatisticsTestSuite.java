package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private StatisticsData statisticsMock;

    private Statistics statistics;
    List<String> userNames;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    int resultListOf0Posts;
    int resultListOf1000Posts;
    int resultListOf0Comments;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("All tests started");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("All tests finished");
    }
    @BeforeEach
    public void beforeEach() {
        statistics = new Statistics(statisticsMock);
        userNames = generateNUsers(44);
        numberOfPosts = 444;
        numberOfComments = 200;
        numberOfUsers = userNames.size();
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
    }
    @AfterEach
    public void afterEach() {
        statistics.calculateAdvStatistics(statisticsMock);
        statistics.showStatistics();

    }

    @Nested
    @DisplayName("Group 1: Posts tests")
    class PostsTests {
        @DisplayName("Test when posts quantity equals 0")
        @Test
        public void testPostsQuantityEquals0() {
            //Given
            resultListOf0Posts = generateNPosts(0);
            when(statisticsMock.postsCount()).thenReturn(resultListOf0Posts);
            //When
            int listOf0Posts = statistics.statisticsData.postsCount();
            //Then
            assertEquals(resultListOf0Posts, listOf0Posts);
        }
        @DisplayName("Test when posts quantity equals 1000")
        @Test
        public void testPostsQuantityEquals1000() {
            //Given
            resultListOf1000Posts = generateNPosts(1000);
            when(statisticsMock.postsCount()).thenReturn(resultListOf1000Posts);
            // When
            int listOf1000Posts = statistics.statisticsData.postsCount();
            //Then
            assertEquals(resultListOf1000Posts, listOf1000Posts);
        }
    }

    @Nested
    @DisplayName("Group 2: Comments tests")
    class CommentsTests {
        @DisplayName("Test when comments quantity equals 0")
        @Test
        public void testCommentsQuantityEquals0() {
            //Given
            resultListOf0Comments = generateNComments(0);
            when(statisticsMock.commentsCount()).thenReturn(resultListOf0Comments);
            //When
            int listOf0Comments = statistics.statisticsData.commentsCount();
            //Then
            assertEquals(resultListOf0Comments, listOf0Comments);
        }

        @DisplayName("Test when comments quantity is less than posts quantity")
        @Test
        public void testCommentsQuantityIsLessThanPostsQuantity() {
            //Given

            //When
            int postsQuantity = statistics.statisticsData.postsCount();
            int commentsQuantity = statistics.statisticsData.commentsCount();
            //Then
            assertTrue(commentsQuantity  < postsQuantity);
        }

        @DisplayName("Test when comments quantity is more than posts quantity")
        @Test
        public void testCommentsQuantityIsMoreThanPostsQuantity() {
            //Given

            //When
            int postsQuantity = statistics.statisticsData.postsCount();
            int commentsQuantity = statistics.statisticsData.commentsCount();
            //Then
            assertFalse(commentsQuantity > postsQuantity);
        }
    }

    @Nested
    @DisplayName("Group 3: Users tests")
    class UsersTests {
        @DisplayName("Test when users quantity equals 0")
        @Test
        public void testUsersQuantityEquals0() {
            //Given
            List<String> resultListOf0Users = generateNUsers(0);
            when(statisticsMock.userNames()).thenReturn(resultListOf0Users);
            //When
            List<String> listOf0Users = statistics.statisticsData.userNames();
            //Then
            assertEquals(0, listOf0Users.size());
        }

        @DisplayName("Test when users quantity equals 100")
        @Test
        public void testUsersQuantityEquals100() {
            //Given
            List<String> resultListOf100Users = generateNUsers(100);
            when(statisticsMock.userNames()).thenReturn(resultListOf100Users);
            //When
            List<String> listOf100Users = statistics.statisticsData.userNames();
            //Then
            assertEquals(resultListOf100Users.size(), listOf100Users.size());
        }
    }

    public List<String> generateNUsers (int users){
        List<String> nUsers = new ArrayList<>();
        for (int i = 1; i < users; i++) {
            String username = "user" + i;
            nUsers.add(username);
        }
        return nUsers;
    }

    public int generateNPosts (int posts){
        if (posts != 0){
            return posts;
        }
        return 0;
    }

    public int generateNComments (int comments){
        if (comments != 0){
            return comments;
        }
        return 0;
    }
}