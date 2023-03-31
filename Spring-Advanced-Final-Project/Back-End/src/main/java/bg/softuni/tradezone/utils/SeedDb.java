/*
package bg.softuni.tradezone.utils;

import bg.softuni.tradezone.model.entity.Region;
import bg.softuni.tradezone.model.entity.Town;
import bg.softuni.tradezone.model.rest.TownBindingModel;
import bg.softuni.tradezone.repository.RegionRepository;
import bg.softuni.tradezone.repository.TownRepository;
import bg.softuni.tradezone.utils.FileUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SeedDb implements CommandLineRunner {

    private static final String TOWNS_JSON_PATH = "C:\\Users\\chavd\\Documents\\Repos\\softuni-project\\trade-zone\\src\\main\\resources\\static\\json\\towns.json";

    private static final String REGIONS_JSON_PATH = "C:\\Users\\chavd\\Documents\\Repos\\softuni-project\\trade-zone\\src\\main\\resources\\static\\json\\regions.json";

    private static final Type CITY_LIST_TYPE = new TypeToken<List<TownBindingModel>>() {
    }.getType();

    private static final Type REGION_LIST_TYPE = new TypeToken<List<Region>>() {
    }.getType();

    private final RegionRepository regionRepository;
    private final TownRepository townRepository;
    private final FileUtil fileUtil;
    private final Gson gson;
    private final ModelMapper mapper;

    @Override
    public void run(String... args) throws Exception {
        String regionsAsString = fileUtil.fileContent(REGIONS_JSON_PATH);
        List<Region> regions = gson.fromJson(regionsAsString, REGION_LIST_TYPE);
        regionRepository.saveAll(regions);

        String townsAsString = fileUtil.fileContent(TOWNS_JSON_PATH);

        List<TownBindingModel> towns = gson.fromJson(townsAsString, CITY_LIST_TYPE);

        List<Town> entities = new ArrayList<>();

        for (TownBindingModel town : towns) {
            Town entity = mapper.map(town, Town.class);
            Region region = regionRepository.findByName(town.getRegion()).orElse(null);
            entity.setRegion(region);
            entities.add(entity);
        }

        townRepository.saveAll(entities);

    }
}
*/
