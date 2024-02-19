package com.faustino.services;

import com.faustino.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        if(order.getBasic() < 100.00){
            return  20.00;
        } else if (order.getBasic() > 100 && order.getBasic() <= 200.00) {
            return 12.00;
        }
        return 0;
    }
}
