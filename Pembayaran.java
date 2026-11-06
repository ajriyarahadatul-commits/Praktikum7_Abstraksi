// Interface kontrak

public interface Pembayaran {
    void prosesPembayaran (double jumlah);
    default void cetakBukti () {
        System.out.println("Bukti pembayaran telah dicetak. ");
    }
}

// Implementasi 1
class TransferBank implements Pembayaran {
    @Override 
    public void prosesPembayaran (double jumlah) {
        System.out.println("Transfer bank Rp " + jumlah + " berhasil. ");
    }
}

// Implementasi 2
class EWallet implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran via E-Wallet Rp " + jumlah + "berhasil. ");
    } 

}