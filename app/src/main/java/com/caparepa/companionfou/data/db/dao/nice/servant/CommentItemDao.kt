package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.CommentItem

@Dao
interface CommentItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(commentItem: CommentItem)

    @Query("SELECT * FROM comment_item")
    suspend fun getCommentItems(): List<CommentItem>
}