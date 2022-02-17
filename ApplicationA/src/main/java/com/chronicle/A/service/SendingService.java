package com.chronicle.A.service;

import com.chronicle.A.dto.Human;
import lombok.extern.slf4j.Slf4j;
import net.openhft.chronicle.Chronicle;
import net.openhft.chronicle.ChronicleQueueBuilder;
import net.openhft.chronicle.ExcerptAppender;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class SendingService {

    public void sendPeople(List<Human> humansList) {
        try {
            File queueDir = new File("chronicle-queue-send");
            log.info(queueDir.getAbsolutePath());
            Chronicle chronicle = ChronicleQueueBuilder.indexed(queueDir).build();
            ExcerptAppender appender = chronicle.createAppender();
            appender.startExcerpt();
            log.info("Zapisuje");
            humansList.forEach(human -> {
                log.info(human.getId().toString());
                appender.writeLong(human.getId());
//                appender.writeInstance(Human.class, human);
//                appender.writeUTF(human.getCity());
            });
            log.info("Appender size: " + appender.size());
            appender.finish();
            log.info("Appender size: " + appender.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
