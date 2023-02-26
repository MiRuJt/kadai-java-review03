package baseball;

public class BaseBallTeam {

    public BaseBallTeam() {

    }

    public BaseBallTeam(String name,int win, int lose, int draw) {

        this.name=name;
        this.win=win;
        this.lose=lose;
        this.draw=draw;



    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int win;
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    private int lose;
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    private int draw;
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void report() {
        System.out.println(this.name+"の2022年の成績は"+this.win+"勝"+this.lose+"敗"+this.draw+"分、勝率は"
                +getRate()+ "です。");
    }

    public double getRate() {
        double rate = (double)this.win/(this.win+this.lose);

        return rate;
    }


}

