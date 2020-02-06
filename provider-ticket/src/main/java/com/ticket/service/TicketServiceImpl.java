package com.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author : Jeffersonnn
 * @date : 2020/2/5
 * @description :
 */
@Component
@Service //此service注解是dubbo框架支持的，作用将该类下的服务发布出去
public class TicketServiceImpl implements TicketService {

    @Override
    public String sellTicket() {
        return "《厉害了,我的国》";
    }
}
