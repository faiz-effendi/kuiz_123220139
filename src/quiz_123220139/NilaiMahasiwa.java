package quiz_123220139;

public class NilaiMahasiwa {
    private String nama;
    private String nim;
    private String tipeKelas;
    private String mataKuliah;
    private double nilaiTugas;
    private double nilaiQuiz;
    
    // setter untuk tulis data 
    void setNilai(String nama, String nim, String tipeKelas, String mataKuliah, double nilaiTugas, double nilaiQuiz){
        this.nama = nama;
        this.nim = nim;
        this.tipeKelas = tipeKelas;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiQuiz = nilaiQuiz;
    }
    
    // getter untuk membaca data private
    String getNama(){
        return this.nama;
    }
    
    String getNim(){
        return this.nim;
    }
    
    String getTipeKelas(){
        return this.tipeKelas;
    }
    
    String getMataKuliah(){
        return this.mataKuliah;
    }
    
    
    double getNilaiTugas(){
        return this.nilaiTugas;
    }
    
    double getNilaiQuiz(){
        return this.nilaiTugas;
    }
}
