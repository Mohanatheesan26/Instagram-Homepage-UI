package com.example.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.adapter.PostAdapter
import com.example.instagram.adapter.StoryAdapter
import com.example.instagram.modules.Post
import com.example.instagram.modules.Story

class MainActivity : AppCompatActivity() {

    private val storyList = ArrayList<Story>()
    private lateinit var storiesAdapter: StoryAdapter

    private val postList = ArrayList<Post>()
    private lateinit var postsAdapter: PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val storiesView = findViewById<RecyclerView>(R.id.recycler_story)
        storiesAdapter = StoryAdapter(storyList)
        val storiesLayoutManager = LinearLayoutManager(applicationContext)
        storiesLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        storiesView.layoutManager = storiesLayoutManager
        storiesView.itemAnimator = DefaultItemAnimator()
        storiesView.adapter = storiesAdapter
        prepareStoryData()

        val postsView = findViewById<RecyclerView>(R.id.recycler_main)
        postsAdapter = PostAdapter(postList)
        val postLayoutManager = LinearLayoutManager(applicationContext)
        postLayoutManager.orientation = LinearLayoutManager.VERTICAL
        postsView.layoutManager = postLayoutManager
        postsView.itemAnimator = DefaultItemAnimator()
        postsView.adapter = postsAdapter
        preparePostData()

    }

    fun prepareStoryData(){
        var story1 = Story("Your Story","https://i.pinimg.com/564x/c2/ac/4b/c2ac4b154498c3fccf794879a30d32cd.jpg")
        storyList.add(story1)
        var story2 = Story("Thalapathy","https://i.pinimg.com/564x/70/31/df/7031df7c82daf1e303891e26062fa219.jpg")
        storyList.add(story2)
        var story3 = Story("Thala","https://i.pinimg.com/564x/eb/85/d9/eb85d9ab3cba37fb41099b318976f430.jpg")
        storyList.add(story3)
        var story4 = Story("Danush","https://i.pinimg.com/564x/ce/e8/b1/cee8b1dea4b58792802035292fcba4ec.jpg")
        storyList.add(story4)
        var story5 = Story("Sethupathy","https://i.pinimg.com/564x/66/f0/19/66f0194eee35432af588aa4fd7c42eef.jpg")
        storyList.add(story5)
        var story6 = Story("Suriya","https://i.pinimg.com/564x/25/4c/9f/254c9feb330634ad0017fa0ef4f92ee5.jpg")
        storyList.add(story6)
        storiesAdapter.notifyDataSetChanged()
    }

    fun preparePostData(){
        var post1 = Post("https://i.pinimg.com/564x/d2/e9/90/d2e990a588421fbcfc4eb95fee9089b2.jpg","Thalaivar","https://i.pinimg.com/564x/2a/1c/07/2a1c074a7803c079832ea19899ecf2b7.jpg")
        postList.add(post1)
        var post2 = Post("https://i.pinimg.com/564x/d7/b6/60/d7b66079018250153f9da14b4fc07fbd.jpg","Thalapathy","https://i.pinimg.com/564x/73/c0/60/73c060365c411ee1a268b2b29ad94a3e.jpg")
        postList.add(post2)
        var post3 = Post("https://i.pinimg.com/564x/eb/85/d9/eb85d9ab3cba37fb41099b318976f430.jpg","Thala","https://i.pinimg.com/564x/ce/1a/3a/ce1a3a5a1e312d997737f4030eecf6cb.jpg")
        postList.add(post3)
        var post4 = Post("https://i.pinimg.com/564x/af/7f/51/af7f51792692939707067f3762ef8ffc.jpg","Danush","https://i.pinimg.com/564x/84/d5/d6/84d5d6574d80f259aed0679d94a5445d.jpg")
        postList.add(post4)
        var post5 = Post("https://i.pinimg.com/564x/21/02/4f/21024f82813929da1b3fc09cd47b28d3.jpg","Sethupathy","https://i.pinimg.com/564x/6e/77/6f/6e776f36e60832cf2dc773d094231004.jpg")
        postList.add(post5)
        var post6 = Post("https://i.pinimg.com/564x/98/49/44/9849447fc57a5823d27442bd6ac349b1.jpg","Suriya","https://i.pinimg.com/564x/ed/b9/f7/edb9f79b4688c334a2d63fa17983ce86.jpg")
        postList.add(post6)
        postsAdapter.notifyDataSetChanged()
    }

}