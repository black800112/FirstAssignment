package com;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DiscountCalcUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField unitPrice;
    private JTextField quantity;
    private JTextArea output; // 改用 JTextArea 才能顯示多行文字

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DiscountCalcUI frame = new DiscountCalcUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DiscountCalcUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 409);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(6, 6, 438, 171);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("商品金額");
        lblNewLabel.setBounds(6, 6, 61, 16);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("購買數量");
        lblNewLabel_1.setBounds(6, 50, 61, 16);
        panel.add(lblNewLabel_1);
        
        unitPrice = new JTextField();
        unitPrice.setBounds(113, 1, 130, 26);
        panel.add(unitPrice);
        unitPrice.setColumns(10);
        
        quantity = new JTextField();
        quantity.setBounds(113, 45, 130, 26);
        panel.add(quantity);
        quantity.setColumns(10);
        
        JButton btnNewButton = new JButton("確認");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    String priceStr = unitPrice.getText().trim();
                    String qtyStr = quantity.getText().trim();
                    
                    if (priceStr.isEmpty() || qtyStr.isEmpty()) {
                        output.setText("請輸入商品金額與數量！");
                        return;
                    }
                    
                    int uniPrice = Integer.parseInt(priceStr);
                    int qty = Integer.parseInt(qtyStr);
                    
                    // 建立物件並計算
                    DiscountCalc D = new DiscountCalc(uniPrice, qty);
                    
                    // 將明細印到 JTextArea 上
                    output.setText(D.show());
                    
                } catch (NumberFormatException ex) {
                    output.setText("請輸入正確的數字格式！");
                }
            }
        });
        btnNewButton.setBounds(286, 6, 117, 29);
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("清除");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                unitPrice.setText("");
                quantity.setText("");
                output.setText(""); // 清空結果框
            }
        });
        btnNewButton_1.setBounds(286, 61, 117, 29);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("掰掰");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_2.setBounds(286, 120, 117, 29);
        panel.add(btnNewButton_2);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(6, 189, 438, 186);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        // 替換為 JTextArea
        output = new JTextArea();
        output.setBounds(6, 6, 426, 174);
        output.setEditable(false); // 設定為不可編輯
        panel_1.add(output);
    }
}