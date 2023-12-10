public class Student {
    private String fio,adress,faculty;
    private int kurs;
    private int [] marks;

    Student(String fio, String adress, String faculty, int kurs, int [] marks){
        this.fio = fio;
        this.adress = adress;
        this.faculty = faculty;
        this.kurs = kurs;
        this.marks = marks;
    }
    String getFio(){
        return fio;
    }
    String getAdress(){
        return adress;
    }
    String getFaculty(){
        return faculty;
    }
    int getKurs(){
        return kurs;
    }
    void setFio(String fio){
        this.fio = fio;
    }
    void setAdress(String adress){
        this.adress = adress;
    }
    void setFaculty(String faculty){
        this.faculty = faculty;
    }
    void setKurs(int kurs){
        this.kurs = kurs;
    }
    void setMarks(int [] marks){
        this.marks = marks;
    }

    double sr(){
        double s = 0;
        for(int i = 0 ; i < marks.length; i++)
            s+=marks[i];
        return s/marks.length;
    }
    public String toString(){
        String s = " ";
        for(int i = 0 ; i < marks.length;i++){
            s += String.valueOf(marks[i]);
        }
        return "Студент, адрес, хуядрес и тд, но вот все же адрес: " + adress;
    }




}
