package utils;

public class OnlineDataUtilQ4 {
    private String[][][] answerList = {
            {
                    {"(6,3),(6,4),(7,3)"},
                    {"(1,7),(2,0),(2,6),(3,1),(3,5),(4,2),(4,4),(5,0),(5,1),(5,2),(5,4),(6,3),(6,4),(7,3)"},
                    {"(0,5),(1,4),(2,3),(3,0),(3,2),(5,0),(5,2),(6,3),(7,4)"},
                    {"(1,4),(2,1),(2,5),(4,5),(5,2),(5,4)"},
                    {""},
                    {""}
            },
            {
                    {"(0,5),(1,3),(1,4)"},
                    {"(1,3),(1,4),(2,5),(3,6),(4,7)"},
                    {"(2,7),(3,6),(4,5),(5,4),(6,3)"},
                    {"(0,5),(0,7),(1,4),(4,5),(4,7)"},
                    {"(0,7),(1,7),(2,7),(3,7),(4,7),(5,7),(6,7),(7,5),(7,6)"},
                    {"(2,5),(2,6),(3,5)"},
            },
            {
                    {"(0,1),(0,3),(1,2),(1,3)","(6,3),(6,4),(7,3),(7,5)"},
                    {""},
                    {"(0,1),(0,5),(1,2),(1,4),(3,2),(3,4),(4,1),(4,5),(5,0),(5,6),(6,7)","(0,6),(1,5),(2,0),(2,4),(3,1),(3,3),(5,1),(5,3),(6,4),(7,5)"},
                    {},
                    {},
                    {"(1,1),(1,2)","(4,0),(5,0)"}
            },
            {
                    {"(0,5),(1,3),(1,4)","(6,3),(7,3)"},
                    {"(0,5),(1,1),(1,4),(2,1),(2,3),(3,0),(3,1),(3,2),(4,0),(4,2),(5,0),(5,1),(5,2),(6,3)"},
                    {"(2,7),(3,6),(4,5),(5,4),(6,3)"},
                    {"(2,5),(4,5),(5,6)"},
                    {"(0,5),(0,7)"},
                    {"(2,1),(3,1)","(4,0),(4,1)"}
            },
            {
                    {"(0,0),(0,2)","(7,0),(7,2)"},
                    {"(1,1),(2,2),(3,3),(4,4),(4,6),(5,5),(5,6),(6,3),(6,4),(6,5),(6,7),(7,5),(7,6),(7,7)"},
                    {"(2,6),(3,5),(4,4),(5,1),(5,3)","(1,7),(3,5),(4,4),(5,3),(6,2)"},
                    {"(2,5),(2,7),(3,4),(5,4),(6,5),(6,7)","(2,1),(3,2),(5,2)"},
                    {"(0,3),(1,3),(2,3),(3,3),(4,3),(5,3),(6,3),(7,2),(7,4),(7,5),(7,6),(7,7)"},
                    {"(2,0),(3,0)","(5,0)","(4,6),(4,7)"}
            }
    };

    private int[][][][] testPointList = {
            {{{7, 4}},{{5, 3}},{{4, 1}},{{3, 3}},{{7, 0}}, {{3, 4}}},
            {{{0, 4}},{{0, 3}},{{7, 2}},{{2, 6}},{{7, 7}},{{1, 5}}},
            {{{0, 2},{7, 4}},{{0, 0}},{{2, 3},{4, 2}},{},{},{{2, 2},{6, 0}}},
            {{{0, 4},{7, 4}},{{4, 1}},{{7,2 }},{{3, 7}},{{0, 6}},{{1, 1},{3, 0}}},
            {{{0, 1},{7, 1}},{{6, 6}},{{6, 2},{2, 6}},{{4, 6},{4, 0}},{{7, 3}},{{1, 0},{6, 0},{5, 7}}}
    };

    private int[][][][] movePointList = {
            {

                    {},  
                    {{5,3,5,2},{0,3,1,4},{5,2,4,1}},
                    {},
                    {{3,3,1,4},{5,5,3,6},{3,3,5,2},{7,1,5,2}},
                    {{7,7,0,0},{7,7,5,7}},
                    {}
            },
            {

                    {},  
                    {},
                    {},
                    {{2,6,6,1},{2,6,4,5},{4,6,4,5}},
                    {{7,7,7,5},{7,0,7,0}},
                    {}
            },
            {
                    {{7,4,6,4},{0,2,0,3}},
                    {},
                    {{0,2,2,3}},
                    {{6,2,4,3}},
                    {{7,7,7,5},{0,4,5,4}},
                    {{2,2,1,1}}
            },
            {

                    {{7,4,6,3},{0,4,1,4}},  
                    {{4,1,3,0},{0,3,4,3},{4,1,3,0}},
                    {{7,5,6,6},{0,2,2,4}},
                    {{3,7,5,6},{7,6,5,5},{5,6,6,4}},
                    {{0,0,3,0},{0,0,2,0}},
                    {{3,0,4,1}}
            },
            {
                    {{0,1,0,2},{7,1,7,2}},
                    {{6,6,4,6},{2,0,3,2}},
                    {{6,2,3,5},{2,6,1,7},{3,5,2,4},{1,7,7,1}},
                    {{4,0,3,2},{4,6,5,4},{3,2,2,4},{5,4,6,2},{2,4,1,1}},
                    {{0,3,0,3},{7,3,7,5},{0,3,7,3},{7,5,1,5},{7,3,7,1}},
                    {{5,7,4,6},{1,5,2,6},{1,5,3,5},{6,0,4,0},{6,0,5,1},{6,1,4,1}}
            }
    };
    private String[][][] moveAfterGameList = {
            {

                    {"",""},
                    {"","","","","B 1",""},
                    {"",""},
                    {"","","","","","","N 1",""},
                    {"","","",""},
                    {"",""},
            },
            {

                    {"B 1\nP 1","q 1\nr 1\np 1"},
                    {"B 1\nP 1","q 1\nr 1\np 1"},
                    {"B 1\nP 1","q 1\nr 1\np 1"},
                    {"B 1\nP 1","q 1\nr 1\np 1","B 1\nP 1","q 1\nr 1\np 1","B 1\nP 1","q 1\nr 1\np 1"},
                    {"B 1\nP 1","q 1\nr 1\np 1","B 1\nP 1","q 1\nr 1\np 1"},
                    {"B 1\nP 1","q 1\nr 1\np 1"}
            },
            {

                    {"Q 1\nR 1\nB 1\nN 2\nP 3","q 1\nn 1\np 2","Q 1\nR 1\nB 1\nN 2\nP 3","q 1\nn 1\np 2"},
                    {},
                    {"Q 1\nR 1\nB 1\nN 2\nP 3","q 1\nn 1\np 2"},
                    {"Q 1\nR 1\nB 1\nN 2\nP 3","q 1\nn 1\np 2"},
                    {"Q 1\nR 1\nB 1\nN 2\nP 3","q 1\nn 1\np 2","Q 1\nR 1\nB 1\nN 2\nP 3","q 1\nb 1\nn 1\np 2"},
                    {"Q 1\nR 1\nB 1\nN 2\nP 4","q 1\nn 1\np 2"}
            },
            {
                    {"B 1\nP 2","","B 1\nP 2",""},
                    {"B 1\nP 2","","B 1\nP 2","p 1","B 1\nP 3","p 1"},
                    {"B 1\nP 2","","B 1\nP 2","p 1"},
                    {"B 1\nP 2","","B 1\nP 2","","B 1\nP 2","p 1"},
                    {"B 1\nP 2","","B 1\nP 2",""},
                    {"B 1\nP 2","q 1"}
            },
            {
                    {"Q 1\nR 1\nB 1\nN 1\nP 2","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 1\nP 2","r 1\nb 1\nn 1\np 3"},
                    {"Q 1\nR 1\nB 1\nN 2\nP 2","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 2\nP 2","r 1\nb 1\nn 1\np 3"},
                    {"Q 1\nR 1\nB 1\nN 1\nP 2","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 1\nP 2","r 1\nb 1\nn 1\np 3",
                            "Q 1\nR 1\nB 1\nN 1\nP 3","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 1\nP 3","k 1\nr 1\nb 1\nn 1\np 3"},
                    {"Q 1\nR 1\nB 1\nN 1\nP 2","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 1\nP 2","r 1\nb 1\nn 1\np 4",
                            "Q 1\nR 1\nB 1\nN 1\nP 3","r 1\nb 1\nn 1\np 4","Q 1\nR 1\nB 1\nN 1\nP 3","r 1\nb 2\nn 1\np 4",
                            "Q 1\nR 1\nB 1\nN 1\nP 3","r 1\nb 2\nn 1\np 4"},
                    {"Q 1\nR 1\nB 1\nN 1\nP 2","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 1\nP 2","r 1\nb 1\nn 1\np 3",
                            "Q 1\nR 1\nB 1\nN 1\nP 2","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 1\nP 3","r 1\nb 1\nn 1\np 3",
                            "Q 1\nR 1\nB 1\nN 1\nP 3","k 1\nr 1\nb 1\nn 1\np 3"},
                    {"Q 1\nR 1\nB 1\nN 2\nP 2","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 2\nP 2","r 1\nb 1\nn 1\np 3",
                            "Q 1\nR 1\nB 1\nN 2\nP 2","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 2\nP 2","r 1\nb 1\nn 1\np 3",
                            "Q 1\nR 1\nB 1\nN 2\nP 2","r 1\nb 1\nn 1\np 3","Q 1\nR 1\nB 1\nN 2\nP 2","r 1\nb 1\nn 1\np 3"}
            }
    };

    private boolean[][][] moveFlagList = {
            {

                    {},
                    {true,true,true},
                    {},
                    {false,true,true,true},
                    {false,false},
                    {}
            },
            {

                    {},
                    {},
                    {},
                    {false,true,false},
                    {false,false},
                    {}
            },
            {

                    {true,true},
                    {},
                    {false},
                    {true},
                    {true,true},
                    {true}
            },
            {

                    {false,true},
                    {false,true,true},
                    {false,true},
                    {true,true,true},
                    {false,true},
                    {true}
            },
            {
                    {false,true},
                    {true,false},
                    {true,true,true,true},
                    {true,true,true,true,false},
                    {false,true,true,true,true},
                    {true,false,true,false,false,true}
            }
    };

    public String[][][] getAnswerList() {
        return answerList;
    }

    public int[][][][] getTestPointList() {
        return testPointList;
    }

    public int[][][][] getMovePointList() {
        return movePointList;
    }

    public String[][][] getMoveAfterGameList() {
        return moveAfterGameList;
    }

    public boolean[][][] getMoveFlagList() {
        return moveFlagList;
    }
}

