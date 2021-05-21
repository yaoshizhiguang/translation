package com.demo.springboot.translation.service;


import com.demo.springboot.translation.common.domain.EntryWithBLOBs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EntryService {
    void addWord(EntryWithBLOBs entry);

    void delete(EntryWithBLOBs entryWithBLOBs);

    EntryWithBLOBs getEntry(EntryWithBLOBs entryWithBLOBs);

    void update(EntryWithBLOBs entryWithBLOBs);

    List<EntryWithBLOBs> getAllEntry(int collectionId);
}
