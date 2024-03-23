package quiz_123220139;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InputNilaiLayout extends JFrame{
    JLabel nama, nim, tipeKelas, mataKuliah, nilaiTugas, nilaiQuiz, tnama, tnim, ttipeKelas, tmataKuliah, tnilaiTugas, tnilaiQuiz;
    
    JTextField textNama, textNim, textTipeKelas, textMatkul, textNilaiTugas, textNilaiQuiz, ttextNama, ttextNim, ttextTipeKelas, ttextMatkul, ttextNilaiTugas, ttextNilaiQuiz;
    
    JButton submit, logout;
    
    NilaiMahasiwa datanya = new NilaiMahasiwa();
    
    InputNilaiLayout(){
        setTitle("Input Nilai");
            
        nama = new JLabel("Nama\t: ");
        nim = new JLabel("NIM\t: ");
        tipeKelas = new JLabel("Tipe Kelas : ");
        mataKuliah = new JLabel("Mata Kuliah : ");
        nilaiTugas = new JLabel("Nilai Tugas :");
        nilaiQuiz = new JLabel("Nilai Quiz : ");
        textNama = new JTextField();
        textNim = new JTextField();
        textTipeKelas = new JTextField();
        textNilaiTugas = new JTextField();
        textNilaiQuiz = new JTextField();
        
        submit = new JButton("Submit");
        logout = new JButton("Logout");
            
        setLayout(null);
        add(nama);
        add(nim);
        add(tipeKelas);
        add(mataKuliah);
        add(nilaiTugas);
        add(nilaiQuiz);
        
        add(textNama);
        add(textNim);
        add(textTipeKelas);
        add(textMatkul);
        add(textNilaiTugas);
        add(textNilaiQuiz);
        
        add(submit);
        add(logout);
        
        add(tnama);
        add(tnim);
        add(ttipeKelas);
        add(tmataKuliah);
        add(tnilaiTugas);
        add(tnilaiQuiz);
        
        add(ttextNama);
        add(ttextNim);
        add(ttextTipeKelas);
        add(ttextMatkul);
        add(ttextNilaiTugas);
        add(ttextNilaiQuiz);
        
        // layouting label
        nama.setBounds(15, 60, 150, 30);
        nim.setBounds(15, 90, 150, 30);
        tipeKelas.setBounds(15, 120, 150, 30);
        mataKuliah.setBounds(15, 150, 150, 30);
        nilaiTugas.setBounds(15, 180, 150, 30);
        nilaiQuiz.setBounds(15, 210, 150, 30);
        
        // layouting text field
        textNama.setBounds(170, 60, 150, 30);
        nim.setBounds(170, 90, 150, 30);
        tipeKelas.setBounds(170, 120, 150, 30);
        mataKuliah.setBounds(170, 150, 150, 30);
        nilaiTugas.setBounds(170, 180, 150, 30);
        nilaiQuiz.setBounds(170, 210, 150, 30);
        
        // layouting button
        submit.setBounds(70, 240, 150, 30);
        submit.setBounds(150, 240, 150, 30);
        
        // layouting transkrip label
        tnama.setBounds(15, 270, 150, 30);
        tnim.setBounds(15, 300, 150, 30);
        ttipeKelas.setBounds(15, 330, 150, 30);
        tmataKuliah.setBounds(15, 360, 150, 30);
        tnilaiTugas.setBounds(15, 390, 150, 30);
        tnilaiQuiz.setBounds(15, 420, 150, 30);
        
        // layouting transkrip label
        ttextNama.setBounds(170, 270, 150, 30);
        ttextNim.setBounds(170, 300, 150, 30);
        ttextTipeKelas.setBounds(170, 330, 150, 30);
        ttextMatkul.setBounds(170, 360, 150, 30);
        ttextNilaiTugas.setBounds(170, 390, 150, 30);
        ttextNilaiQuiz.setBounds(170, 420, 150, 30);
            
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    String nama = textNama.getText();
                    String nim = textNim.getText();
                    String tipeKelas = textTipeKelas.getText();
                    String matkul = textMatkul.getText();
                    double nilaiTugas = Double.parseDouble(textNilaiTugas.getText())*30/100;
                    double nilaiQuiz = Double.parseDouble(textNilaiQuiz.getText())*70/100;

                    datanya.setNilai(nama, nim, tipeKelas, matkul, nilaiTugas, nilaiQuiz);

                    ttextNama.setText(datanya.getNama());
                    ttextNim.setText(datanya.getNim());
                    ttextTipeKelas.setText(datanya.getTipeKelas());
                    ttextMatkul.setText(datanya.getMataKuliah());
                    ttextNilaiTugas.setText(String.valueOf(datanya.getNilaiTugas()));
                    ttextNilaiQuiz.setText(String.valueOf(datanya.getNilaiQuiz()));
                } catch(HeadlessException er){
                    System.out.println(er.getMessage());
                }   
            }
        });
                
            
            setSize(400, 1200);
            setVisible(true);
//            setLocationRelativeTO(null);
//            setDefaultCloseOperator(EXIT_ON_CLOSE);
    }
}
                