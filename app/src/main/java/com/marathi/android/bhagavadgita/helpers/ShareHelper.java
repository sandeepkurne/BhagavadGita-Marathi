package com.marathi.android.bhagavadgita.helpers;

import android.content.Context;
import android.content.Intent;

import com.marathi.android.bhagavadgita.data.BookData;

/**
 * Created by Sandeep.
 */
public class ShareHelper {
  public static final String BASE_URL = "http://sandeepkurne.github.io/BhagavadGita/share/";

  public static void ShareChapter(Context context, String chapterName) {
    String chapterTitle = ChapterHelper.getChapterTitleFromChapterSections(BookData.Chapters.get(chapterName));
    Share(context, "Share " + chapterTitle, getChapterLink(chapterName), chapterTitle);
  }

  private static void Share(Context context, String subject, String link, String linkTitle) {
    Intent share = new Intent(android.content.Intent.ACTION_SEND);
    share.setType("text/plain");
    //noinspection deprecation
    share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

    // Add data to the intent, the receiving app will decide
    // what to do with it.
    share.putExtra(Intent.EXTRA_SUBJECT, linkTitle);
    share.putExtra(Intent.EXTRA_TEXT, link);

    context.startActivity(Intent.createChooser(share, subject));
  }

  private static String getChapterLink(String chapterName) {
    return BASE_URL + ChapterHelper.getChapterIndexFromChapterName(chapterName);
  }

  public static void ShareSection(Context context, String title, String queryString) {
    Share(context, "Share " + title, getSectionLink(queryString), title);
  }

  private static String getSectionLink(String queryString) {
    return BASE_URL + queryString;
  }

}
