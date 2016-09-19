package com.marathi.android.bhagavadgita.models;

import java.util.List;

/**
 * Created by Sandeep.
 */
public class Book {
  private String BookTitle;
  private List<Chapter> Chapters;

  public Book(String bookTitle, List<Chapter> chapters) {
    BookTitle = bookTitle;
    Chapters = chapters;
  }

  public String getBookTitle() {
    return BookTitle;
  }

  public void setBookTitle(String bookTitle) {
    BookTitle = bookTitle;
  }

  public List<Chapter> getChapters() {
    return Chapters;
  }

  public void setChapters(List<Chapter> chapters) {
    Chapters = chapters;
  }
}
