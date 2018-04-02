package iotek.feign.consumer.service;

import com.iotek.api.service.CustomerApiService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
@FeignClient("customer-service")
public interface CustomerService extends CustomerApiService {

}
