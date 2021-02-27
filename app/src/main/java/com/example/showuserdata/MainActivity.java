package com.example.showuserdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Model.Quiz;
import com.example.adapter.UserAdapter;
import com.example.viewmodel.UserViewModel;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private UserViewModel userViewModel;
    UserAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        adapter = new UserAdapter();
        recyclerView.setAdapter(adapter);

        userViewModel = ViewModelProviders.of(this).get(UserViewModel.class);
//        Gson gson = new Gson();
//        Log.d("contactList","contactList size 111 = " );
//        Type type = new TypeToken<List<Aaa>>(){}.getType();
//        Log.d("contactList","contactList size 222 = " );
//        Article contactList = gson.fromJson("{\"status\":\"ok\",\"totalResults\":10,\"articles\":[{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Cocaine 'worth billions' seized in record Germany and Belgium haul\",\"description\":\"More than 23 tonnes of the drug was discovered in two raids on shipments heading to the Netherlands.\",\"url\":\"http://www.bbc.co.uk/news/world-europe-56177177\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/B44F/production/_117195164_hi065893173.jpg\",\"publishedAt\":\"2021-02-24T16:52:27.9053295Z\",\"content\":\"image captionThe cocaine discovered in Germany was hidden in more than 1,700 tins of wall filler\\r\\nCustoms authorities in Germany and Belgium have seized a record of more than 23 tonnes of cocaine tha… [+2909 chars]\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Johnson and Johnson vaccine: FDA finds the single-shot jab safe\",\"description\":\"US regulators say Johnson and Johnson's single-shot vaccine is safe, and could be approved in days.\",\"url\":\"http://www.bbc.co.uk/news/world-us-canada-56186965\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/A0D1/production/_117196114_gettyimages-1230141837.jpg\",\"publishedAt\":\"2021-02-24T16:52:20.8740247Z\",\"content\":\"image copyrightGetty Images\\r\\nA review by US regulators of the single-shot Johnson &amp; Johnson coronavirus vaccine finds it is safe, especially against severe cases.\\r\\nIt paves the way for a third Co… [+2037 chars]\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Sued by the man I reported for rape\",\"description\":\"Twins Verity and Lucy were taken to court after speaking out on social media, naming their alleged abuser.\",\"url\":\"http://www.bbc.co.uk/news/uk-56173394\",\"urlToImage\":\"https://ichef.bbci.co.uk/images/ic/400xn/p097tzt2.jpg\",\"publishedAt\":\"2021-02-24T13:22:28.3579148Z\",\"content\":\"Two sisters say theyve been silenced by the man they reported for sexual assault after he sued them for talking about what happened.\\r\\nTwins Verity and Lucy named the man in allegations on social medi… [+722 chars]\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Daniel Prude: No charges for US officers over 'spit-hood' death\",\"description\":\"Officers in New York were filmed using a hood to restrain Daniel Prude until he stopped breathing.\",\"url\":\"http://www.bbc.co.uk/news/world-us-canada-56174489\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/10F38/production/_114223496_capture.png\",\"publishedAt\":\"2021-02-24T13:07:23.9364777Z\",\"content\":\"image copyrightWe The People/ GoFundMe\\r\\nimage captionDaniel Prude died a week after he was restrained by police\\r\\nNew York police officers filmed restraining an unarmed black man until he stopped brea… [+2183 chars]\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Ghislaine Maxwell offers to give up UK and French citizenship for bail\",\"description\":\"The British socialite is in jail in New York awaiting trial on sex trafficking charges.\",\"url\":\"http://www.bbc.co.uk/news/world-us-canada-56181754\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/EB30/production/_117180206_gettyimages-590696434.jpg\",\"publishedAt\":\"2021-02-24T12:52:22.3108946Z\",\"content\":\"image copyrightGetty Images\\r\\nimage captionGhislaine Maxwell, pictured with Jeffrey Epstein, is due to stand trial in July\\r\\nBritish socialite Ghislaine Maxwell has offered to give up her UK and French… [+1958 chars]\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Amnesty strips Alexei Navalny of 'prisoner of conscience' status\",\"description\":\"Amnesty said it took the decision after complaints of \\\"hate speech\\\" by the Russian opposition leader.\",\"url\":\"http://www.bbc.co.uk/news/world-europe-56181084\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/115C4/production/_117180117_117cc097-431a-4291-82d0-d1301f7e6dd5.jpg\",\"publishedAt\":\"2021-02-24T11:07:22.3272188Z\",\"content\":\"By Sarah RainsfordBBC News, Moscow\\r\\nimage captionAlexei Navalny returned to Russia in January after a near-fatal nerve agent attack\\r\\nAmnesty International has stripped the Russian opposition politici… [+4678 chars]\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Rescuers save 28 whales from stranding spot\",\"description\":\"Rescuers have successfully refloated 28 pilot whales on a notorious New Zealand beach, Farewell Spit.\",\"url\":\"http://www.bbc.co.uk/news/world-asia-56181866\",\"urlToImage\":\"https://ichef.bbci.co.uk/images/ic/400xn/p097w9zq.jpg\",\"publishedAt\":\"2021-02-24T10:37:21.5468298Z\",\"content\":\"Rescuers have successfully refloated 28 pilot whales on a notorious New Zealand beach where they had repeatedly beached themselves.\\r\\nThe long-finned pilot whales were part of a pod of around 50 first… [+245 chars]\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Covid: WHO scheme Covax delivers first vaccines to Ghana\",\"description\":\"It is a milestone for the WHO scheme, which aims to ensure the fair distribution of Covid-19 jabs.\",\"url\":\"http://www.bbc.co.uk/news/world-africa-56180161\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/80E5/production/_117179923_gettyimages-1230243668.jpg\",\"publishedAt\":\"2021-02-24T09:52:20.8581087Z\",\"content\":\"image copyrightAnadolu Agency via Getty Images\\r\\nimage captionGhana has recorded more than 80,700 cases of coronavirus\\r\\nGhana has become the first country to receive coronavirus vaccines through the C… [+2188 chars]\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Biden holds first foreign meeting with Canada's Justin Trudeau\",\"description\":\"\\\"US leadership has been sorely missed over the past years,\\\" the Canadian prime minister said.\",\"url\":\"http://www.bbc.co.uk/news/world-us-canada-56177486\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/0AC5/production/_117175720_gettyimages-1231345915.jpg\",\"publishedAt\":\"2021-02-24T01:37:21.3813871Z\",\"content\":\"image copyrightGetty Images\\r\\nimage captionMr Trudeau, far right, appears on screen during the virtual meeting\\r\\nUS President Joe Biden has spoken with Canadian Prime Minister Justin Trudeau in his fir… [+4017 chars]\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Buttergate: Why are Canadians complaining about hard butter?\",\"description\":\"Canadians say that the consistency of local butter has changed. Experts may have found the culprit.\",\"url\":\"http://www.bbc.co.uk/news/world-us-canada-56175784\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/A697/production/_117174624_gettyimages-1157236482.jpg\",\"publishedAt\":\"2021-02-23T19:22:25.9434475Z\",\"content\":\"image copyrightGetty Images\\r\\nimage captionStock photo of butter being spread on bread\\r\\nSomething is amiss with Canadian butter, according to local foodies, who have been arguing for weeks that their … [+3081 chars]\"}]}", type);
//        Log.d("contactList","contactList size = " + contactList.getAuthor());
        getData();

    }

    private void getData() {

        userViewModel.getAllUsers().observe(this, userList -> {
            adapter.setUserList((ArrayList<Quiz>) userList);
        });

    }


}
