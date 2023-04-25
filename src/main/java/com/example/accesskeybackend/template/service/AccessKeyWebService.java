package com.example.accesskeybackend.template.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.net.*;
import java.util.Arrays;

@Service
@Log4j2
public class AccessKeyWebService {
    public boolean checkSiteIpv6Support(String urlString) {
        try {
            InetAddress[] inetAddresses = InetAddress.getAllByName(urlString);
            return Arrays.stream(inetAddresses)
                    .anyMatch(address -> address instanceof Inet6Address);
        } catch (UnknownHostException e) {
            return false;
        }
    }
}
