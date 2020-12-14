package com.example.Navigation;

import com.amap.api.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Graph {
    private int VexNum;//顶点数
    private int ArcNum;//边数
    public final int MAXInt = Integer.MAX_VALUE;//最大权重
    public final int MVNum = 100;//最大顶点数
    private Vertex Vexs[];//顶点表
    private int Matrix[][];//邻接矩阵

    public Graph(){
        Vexs = new Vertex [0];
        Matrix = new int[0][0];
    }

    public int getArcNum() {
        return ArcNum;
    }

    public int getVexNum() {
        return VexNum;
    }

    public void setArcNum(int arcNum) {
        this.ArcNum = arcNum;
    }

    public void setVexNum(int vexNum) {
        this.VexNum = vexNum;
    }

    public void setEdg(int x,int y,int weight){
        //设置权重
        this.Matrix[x][y] = weight;
        this.Matrix[y][x] = weight;
    }

    public void GraphBuild(){
        this.setVexNum(66);                       //定义顶点个数
        this.Vexs = new Vertex[this.VexNum];
        this.Matrix = new int[this.VexNum][this.VexNum];

        for (int i = 0;i<VexNum;i++){
            for (int j = 0;j<VexNum;j++){
                Matrix[i][j] = MAXInt;
            }
        }
        Vexs[0] = new Vertex("大门");
        Vexs[1] = new Vertex("主楼");
        Vexs[2] = new Vertex("主楼k1");
        Vexs[3] = new Vertex("联通广场");
        Vexs[4] = new Vertex("第一图书馆");
        Vexs[5] = new Vertex("1号教学楼");
        Vexs[6] = new Vertex("医院");
        Vexs[7] = new Vertex("实验楼");
        Vexs[8] = new Vertex("体育场");
        Vexs[9] = new Vertex("体育场k2");
        Vexs[10] = new Vertex("体育场k3");
        Vexs[11] = new Vertex("汇文楼k4");
        Vexs[12] = new Vertex("汇文楼");
        Vexs[13] = new Vertex("汇文楼k5");
        Vexs[14] = new Vertex("综合楼k6");
        Vexs[15] = new Vertex("综合楼");
        Vexs[16] = new Vertex("地下通道C口");
        Vexs[17] = new Vertex("4号教学楼");
        Vexs[18] = new Vertex("3号教学楼");
        Vexs[19] = new Vertex("C区游泳馆");
        Vexs[20] = new Vertex("艺术楼");
        Vexs[21] = new Vertex("体育场k7");
        Vexs[22] = new Vertex("1号楼k8");
        Vexs[23] = new Vertex("1号楼k9");
        Vexs[24] = new Vertex("联通广场k10");
        Vexs[25] = new Vertex("实验楼k11");
        Vexs[26] = new Vertex("体育场k12");
        Vexs[27] = new Vertex("一号楼k13");

        Vexs[28] = new Vertex("b超右");
        Vexs[29] = new Vertex("b超");
        Vexs[30] = new Vertex("排球场");
        Vexs[31] = new Vertex("排左");
        Vexs[32] = new Vertex("b食左中");
        Vexs[33] = new Vertex("b食左上");
        Vexs[34] = new Vertex("b食");
        Vexs[35] = new Vertex("b食堂左中左");
        Vexs[36] = new Vertex("化学楼");
        Vexs[37] = new Vertex("排左下");
        Vexs[38] = new Vertex("生左上");
        Vexs[39] = new Vertex("生命");
        Vexs[40] = new Vertex("农右上");
        Vexs[41] = new Vertex("农学楼");
        Vexs[42] = new Vertex("a食");
        Vexs[43] = new Vertex("a食左");
        Vexs[44] = new Vertex("新图书馆");
        Vexs[45] = new Vertex("新图下");
        Vexs[46] = new Vertex("博物馆");
        Vexs[47] = new Vertex("博物馆左");
        Vexs[48] = new Vertex("新图左");
        Vexs[49] = new Vertex("新图下下");
        Vexs[50] = new Vertex("b食左上上上");
        Vexs[51] = new Vertex("化左上");
        Vexs[52] = new Vertex("2号楼下");
        Vexs[53] = new Vertex("网球场左下");
        Vexs[54] = new Vertex("网球场");

        Vexs[55] = new Vertex("体育馆");
        Vexs[56] = new Vertex("体育馆右");
        Vexs[57] = new Vertex("第一游泳馆");
        Vexs[58] = new Vertex("联通右上");
        Vexs[59] = new Vertex("联通右上上");
        Vexs[60] = new Vertex("体育场左上");
        Vexs[61] = new Vertex("体育场上");
        Vexs[62] = new Vertex("体育场右上");
        Vexs[63] = new Vertex("汇文楼右上");
        Vexs[64] = new Vertex("二号楼");
        Vexs[65] = new Vertex("老图左");


        Vexs[0].input(45.708027,126.613903);
        Vexs[1].input(45.708196,126.614702);
        Vexs[2].input(45.707297,126.614901);
        Vexs[3].input(45.707589,126.617492);
        Vexs[4].input(45.708421,126.618672);
        Vexs[5].input(45.707848,126.619026);
        Vexs[6].input(45.707683,126.619133);
        Vexs[7].input(45.707294,126.619456);
        Vexs[8].input(45.708342,126.619935);
        Vexs[9].input(45.708114,126.620485);
        Vexs[10].input(45.708376,126.621188);
        Vexs[11].input(45.708593,126.622706);
        Vexs[12].input(45.709361,126.622395);
        Vexs[13].input(45.708616,126.623202);
        Vexs[14].input(45.707318,126.623393);
        Vexs[15].input(45.706896,126.623291);
        Vexs[16].input(45.706986,126.624208);
        Vexs[17].input(45.707226,126.624578);
        Vexs[18].input(45.706784,126.624616);
        Vexs[19].input(45.707173,126.627234);
        Vexs[20].input(45.707387,126.628135);
        Vexs[21].input(45.708464,126.619558);
        Vexs[22].input(45.707853,126.619821);
        Vexs[23].input(45.707767,126.619069);
        Vexs[24].input(45.707695,126.618485);
        Vexs[25].input(45.707772,126.619316);
        Vexs[26].input(45.708223,126.619815);
        Vexs[27].input(45.708223,126.618404);

        Vexs[28].input(45.706418,126.62343);
        Vexs[29].input(45.706451,126.622653);
        Vexs[30].input(45.706268,126.621644);
        Vexs[31].input(45.706223,126.621306);
        Vexs[32].input(45.706893,126.621156);
        Vexs[33].input(45.707129,126.621119);
        Vexs[34].input(45.707159,126.621483);
        Vexs[35].input(45.706833,126.620518);
        Vexs[36].input(45.707189,126.620453);
        Vexs[37].input(45.705889,126.621381);
        Vexs[38].input(45.705803,126.620775);
        Vexs[39].input(45.705503,126.620845);
        Vexs[40].input(45.705728,126.620223);
        Vexs[41].input(45.705458,126.620201);
        Vexs[42].input(45.706743,126.619611);
        Vexs[43].input(45.706627,126.618528);
        Vexs[44].input(45.706301,126.618613);
        Vexs[45].input(45.705972,126.618699);
        Vexs[46].input(45.705867,126.617557);
        Vexs[47].input(45.705818,126.617063);
        Vexs[48].input(45.706455,126.616924);
        Vexs[49].input(45.705507,126.618807);
        Vexs[50].input(45.708227,126.620899);
        Vexs[51].input(45.707893,126.620325);
        Vexs[52].input(45.707526,126.616693);
        Vexs[53].input(45.706279,126.615105);
        Vexs[54].input(45.706316,126.615534);

        Vexs[55].input(45.708971,126.614532);
        Vexs[56].input(45.709219,126.616313);
        Vexs[57].input(45.709908,126.616174);
        Vexs[58].input(45.709402,126.617939);
        Vexs[59].input(45.709713,126.617987);
        Vexs[60].input(45.709718,126.619204);
        Vexs[61].input(45.710017,126.620164);
        Vexs[62].input(45.709916,126.620867);
        Vexs[63].input(45.710092,126.622401);
        Vexs[64].input(45.708328,126.616521);
        Vexs[65].input(45.708369,126.618147);


        this.setEdg(0, 1, 80);                                    //大门

        this.setEdg(1, 2, 90);                                    //主楼

        this.setEdg(2, 3, 210);                                   //主楼k1

        // this.setEdg(3, 4, 120);                                   //联通广场
        this.setEdg(3, 23, 110);
        this.setEdg(3, 24, 45);

        this.setEdg(4, 21, 75);                                   //图书馆
        this.setEdg(4, 27, 40);

        this.setEdg(5, 23, 25);                                   //1号教学楼

        this.setEdg(6, 23, 15);                                   //医院

        this.setEdg(7, 25, 50);                                   //实验楼

        this.setEdg(8, 26, 10);                                   //体育场

        this.setEdg(9, 10, 50);                                   //体育场k2
        this.setEdg(9, 26, 60);

        this.setEdg(10, 11, 130);                                   //体育场k3

        this.setEdg(11,12, 90);                                   //汇文楼k4
        this.setEdg(11,13, 45);

        this.setEdg(13, 15, 180);                                   //汇文楼k5

        this.setEdg(14, 15, 40);                                   //综合楼k6

        this.setEdg(15, 16, 50);                                   //综合楼

        this.setEdg(16, 17, 50);                                   //地下通道C口
        this.setEdg(16, 18, 50);
        this.setEdg(16, 19, 220);
        this.setEdg(16, 20, 300);

        this.setEdg(17, 18, 60);                                   //3号教学楼
        this.setEdg(17, 19, 200);
        this.setEdg(17, 20, 290);

        this.setEdg(18, 19, 200);                                   //4号教学楼
        this.setEdg(18, 20, 290);

        this.setEdg(19, 20, 110);                                   //游泳馆

        this.setEdg(20, 19, 100);                                   //艺术楼

        this.setEdg(21, 26, 40);                                    //体育场k7

        this.setEdg(22, 23, 65);                                   //1号楼k8
        this.setEdg(22, 25, 40);
        this.setEdg(22, 26, 60);

        this.setEdg(23, 24, 50);                                   //1号楼k9
        this.setEdg(23, 25, 15);

        this.setEdg(24, 27, 55);                                   //一号楼k13

        this.setEdg(15, 28, 50);
        this.setEdg(28, 29, 60);
        this.setEdg(29, 30, 88);
        this.setEdg(30, 31, 28);
        this.setEdg(31, 37, 36);
        this.setEdg(37, 38, 49);
        this.setEdg(38, 39, 36);
        this.setEdg(38, 40, 45);
        this.setEdg(40, 41, 40);
        this.setEdg(41, 49, 95);
        this.setEdg(40, 49, 118);
        this.setEdg(49, 45, 55);
        this.setEdg(44, 45, 36);
        this.setEdg(43, 44, 36);
        this.setEdg(42, 43, 85);
        this.setEdg(42, 35, 80);
        this.setEdg(35, 32, 50);
        this.setEdg(32, 31, 77);
        this.setEdg(32, 33, 25);
        this.setEdg(33, 34, 30);
        this.setEdg(34, 14, 170);
        this.setEdg(33, 50, 125);
        this.setEdg(50, 9, 28);
        this.setEdg(50, 10, 30);
        this.setEdg(35, 36, 50);
        this.setEdg(36, 51, 75);
        this.setEdg(51, 22, 40);
        this.setEdg(51, 9, 40);
        this.setEdg(7, 42, 55);
        this.setEdg(43, 24, 120);
        this.setEdg(45, 46, 66);
        this.setEdg(46, 47, 62);
        this.setEdg(47, 48, 72);
        this.setEdg(43, 48, 128);
        this.setEdg(48, 52, 120);
        this.setEdg(52, 3, 66);
        this.setEdg(52, 2, 144);
        this.setEdg(54, 48, 108);
        this.setEdg(53, 54, 35);
        this.setEdg(53, 2, 118);

        this.setEdg(55, 1, 90);
        this.setEdg(55, 56, 141);
        this.setEdg(56, 57, 80);
        this.setEdg(56, 64, 100);
        this.setEdg(64, 52, 88);
        this.setEdg(56, 58, 128);
        this.setEdg(58, 59, 36);
        this.setEdg(58, 65, 113);
        this.setEdg(65, 4, 42);
        this.setEdg(65, 24, 80);
        this.setEdg(59, 60, 96);
        this.setEdg(60, 21, 145);
        this.setEdg(60, 61, 76);
        this.setEdg(61, 62, 60);
        this.setEdg(42, 43, 85);
        this.setEdg(42, 35, 80);
        this.setEdg(62, 10, 172);
        this.setEdg(62, 63, 123);
        this.setEdg(63, 12, 88);

    }

    /**
     * 迪杰斯特拉算法，求vs到其他各个点之间的最短路径
     * @param vs 开始结点
     * @param end 终点
     */
    public List<LatLng> dijkstra(int vs, int end){
        boolean [] flag = new boolean[VexNum];//从源点vs到终点vi是否已被确定最短路径长度
        int []dist = new int[VexNum];//记录源点vs到vi的距离长度
        int []prev = new int[VexNum];//记录vi的前驱顶点,自己到自己为-1
        List<LatLng> points = new ArrayList<>();

        //初始化
        for (int i = 0;i<VexNum;i++){
            flag[i] = false;
            dist[i] = Matrix[vs][i];
            if (dist[i]<MAXInt) {
                prev[i] = vs;
            }else {
                prev[i] = -1;
            }
        }

        //初始化vs
        flag[vs] = true;
        dist[vs] = 0;

        int k = -1;
        //遍历vexnum-1次，每次找出一个点距离源点vs的最短路径
        for (int i = 1;i<VexNum;i++){
            //在未获得最小路径的顶点中，先找出距离vs最近的一个点
            int min = MAXInt;
            for (int w = 0;w<VexNum;w++){
                if (!flag[w]&&dist[w]<min){
                    min = dist[w];
                    k = w;
                }
            }

            //将找到的距离vs最近的点标记为已经找到最小路径
            flag[k] = true;

            //更新剩下的未找到最小路径的点到vs的距离以及其前驱顶点
            for (int w = 0;w<VexNum;w++){
                if (!flag[w]&&(dist[k] + Matrix[k][w])<dist[w]){
                    dist[w] = dist[k] + Matrix[k][w];
                    prev[w] = k;
                }
            }
        }

        //输出最短路径
        Stack<Vertex> stack = new Stack<>();
        int index = end;
        while (index!=vs){
            stack.push(Vexs[index]);
            index = prev[index];
        }
        //将源点vs加入栈
        stack.push(Vexs[index]);
        while (!stack.empty()){
            Vertex vertex = stack.pop();
            System.out.println(vertex.getName()+"---->");
            points.add(new LatLng(vertex.getX(),vertex.getY()));
        }
        return points;
    }

    public List<LatLng> floyd(int start,int end){
        int[][] dist = new int[VexNum][VexNum];
        int[][] prev = new int[VexNum][VexNum];
        List<LatLng> points = new ArrayList<>();
        for (int i = 0;i<VexNum;i++){
            for (int j = 0;j<VexNum;j++){
                dist[i][j] = Matrix[i][j];
                if (dist[i][j]<MAXInt){
                    prev[i][j] = i;
                }else {
                    prev[i][j] = -1;
                }
            }
        }

        for (int k = 0;k<VexNum;k++){
            for (int i = 0;i<VexNum;i++){
                for (int j = 0;j<VexNum;j++){
                    if (dist[i][k]+dist[k][j]<dist[i][j]){
                        dist[i][j] = dist[i][k]+dist[k][j];
                        prev[i][j] = prev[k][j];
                    }
                }
            }
        }

        //输出最短路径
        int vs = start;
        int index = end;
        Stack<Vertex> stack = new Stack<>();
        while (index>vs){
            stack.push(Vexs[index]);
            index = prev[vs][index];
        }
        //将源点vs加入栈
        stack.push(Vexs[index]);
        while (!stack.empty()){
            Vertex vertex = stack.pop();
            System.out.println(vertex.getName()+"---->");
            points.add(new LatLng(vertex.getX(),vertex.getY()));
        }

        return points;
    }

}
