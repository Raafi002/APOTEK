/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Pastikan GUI dijalankan dalam Event Dispatch Thread (EDT) agar thread-safe
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Membuat instance dari frame TampilanAwal
                TampilanAwal tampilanAwalFrame = new TampilanAwal();
                tampilanAwalFrame.setVisible(true);  // Menampilkan frame
                tampilanAwalFrame.setLocationRelativeTo(null); // Menempatkan frame di tengah layar
            }
        });
    }
}
