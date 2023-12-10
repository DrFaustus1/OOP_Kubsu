public class Data {
    int d,m,y;

    int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    Data(int d,int m,int y) throws MyException{

        if(d>31 || m > 12 || y < 1 || d < 0 || m < 1)
            throw new MyException("Некорректная дата", d,m,y);
        this.d = d;
        this.m = m;
        this.y = y;
    }
    String print()throws MyException{
        return "Итоговая дата: " + d + " " + m + " " + y;
    }

    Data AddDays(int day) throws MyException{
        int new_day = (this.d + day) % days[m];
        int new_month = this.m + new_day / days[m];
        int new_year = this.y + new_month / 12;

        Data new_data = new Data(new_day,new_month,new_year);
        return new_data;
    }


}
