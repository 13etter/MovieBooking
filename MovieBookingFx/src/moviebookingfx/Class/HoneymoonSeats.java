/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviebookingfx.Class;

/**
 *
 * @author terkg
 */
public class HoneymoonSeats extends Seats{

    public HoneymoonSeats(String position) {
        super(position);
        this.init();
    }

    @Override
    public void init() {
        this.setName("Honeymoon Seat");
        this.setPrice(120);
    }
    
}
