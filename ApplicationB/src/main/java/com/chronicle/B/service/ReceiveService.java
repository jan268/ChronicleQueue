package com.chronicle.B.service;

import lombok.extern.slf4j.Slf4j;
import net.openhft.chronicle.Chronicle;
import net.openhft.chronicle.ChronicleQueueBuilder;
import net.openhft.chronicle.ExcerptTailer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ReceiveService {

    public void loadFromQueue() {
        try {

//            File file = new File(classLoader.getResource("chronicle-queue-send").getFile());
            Chronicle chronicle = ChronicleQueueBuilder.indexed("chronicle-queue-send.data").build();
            ExcerptTailer tailer = chronicle.createTailer();
            List<String> objects = new ArrayList<>();
            while (tailer.nextIndex()) {
                objects.add(tailer.readUTF());
            }
            tailer.finish();
            log.info("App B is okey");
            objects.forEach(log::info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
