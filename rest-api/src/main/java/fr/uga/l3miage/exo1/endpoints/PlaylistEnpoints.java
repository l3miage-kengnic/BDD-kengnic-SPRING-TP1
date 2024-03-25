package fr.uga.l3miage.exo1.endpoints;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name= "Getsion playlist", description = "Tous les endpoints de gestion d'une playlist")
@RestController
@RequestMapping
public interface PlaylistEnpoints {
    PlaylistResponseDTO addSongInPlaylist(@PathVariable(name= "idPlaylist")String idPlaylist, @RequestParam String idSong);
}
