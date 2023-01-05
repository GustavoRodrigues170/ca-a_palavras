package PEOO;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyJButton extends JButton {
    
    private Integer row, col;
    private Jogo pai;
    private boolean marcado;
    
    public MyJButton (Integer row, Integer col, Jogo pai) {
        setRow(row);
        setCol(col);
        setPai(pai);
        setMarcado(false);
        setFont(new Font(null , 0, 20));
        
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pai.marcarJogada((MyJButton)(evt.getSource()));
            }
        });
    }
    
    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
        if(marcado){
            setFont(new Font(null, Font.BOLD, 20));
            setForeground(Color.red);
        }else{
            setFont(new Font(null, 0, 20));
            setForeground(Color.black);
        }
        
    }    
    
    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }
    
    public Jogo getPai() {
        return pai;
    }

    public void setPai(Jogo pai) {
        this.pai = pai;
    }    
}
