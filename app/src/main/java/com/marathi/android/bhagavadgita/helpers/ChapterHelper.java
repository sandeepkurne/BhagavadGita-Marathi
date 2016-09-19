package com.marathi.android.bhagavadgita.helpers;

import com.marathi.android.bhagavadgita.data.BookData;
import com.marathi.android.bhagavadgita.data.ChapterSection;
import com.marathi.android.bhagavadgita.data.SectionType;
import com.marathi.android.bhagavadgita.models.Chapter;

import java.util.ArrayList;

/**
 * Created by Sandeep.
 */
public class ChapterHelper {
  public static String getChapterTitleFromChapterSections(ArrayList<ChapterSection> mChapterSections) {
    for (ChapterSection section : mChapterSections) {
      if (section.Type == SectionType.Title) {
        return section.Content;
      }
    }
    return null;
  }

  public static int getChapterIndexFromChapterName(String chapterName) {
    return BookData.ChapterIndexes.get(chapterName);
  }

  public static Chapter getChapterFromChapterIndex(int chapterIndex) {
    return BookData.Book.getChapters().get(chapterIndex);
  }
}
