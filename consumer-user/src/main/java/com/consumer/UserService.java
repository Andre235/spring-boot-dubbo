package com.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author : Jeffersonnn
 * @date : 2020/2/6
 * @description :
 */
@Service
public class UserService {


    /**
     * 远程全类名引用ticketService
     */
    @Reference
    TicketService ticketService;

    void hello(){
        String s = ticketService.sellTicket();
        System.out.println("买到票了"+s);
    }

}
