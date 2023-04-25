package com.example.accesskeybackend.template.service;

import org.springframework.stereotype.Service;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

@Service
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
