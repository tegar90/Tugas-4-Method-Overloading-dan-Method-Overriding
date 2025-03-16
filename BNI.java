/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransaksiBank;

/**
 *
 * @author USER90
 */
public class BNI extends Bank {

    public BNI(String bank_bni) {
    }

    

    @Override
   public void SukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah 4 %");
    }

  
    @Override
   public void TransferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Bank Asal BNI" + " " + "Transfer Rp Sebesar" + " " + jumlah +  " " + " Tujuan Bank Yang Akan DiTransfer " + " " + rekeningTujuan + " " + " Bank Tujuan Adalah Bank BCA");
    }
}