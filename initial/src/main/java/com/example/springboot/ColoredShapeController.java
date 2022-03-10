package com.example.springboot;

import com.example.springboot.service.IColoredShape;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
public class ColoredShapeController {

	private final Map<String, IColoredShape> coloredShapeMap;

	public ColoredShapeController(final Map<String, IColoredShape> coloredShapeMap){
		this.coloredShapeMap = coloredShapeMap;
	}

	@GetMapping("/{color}/{shape}")
	public String get(@PathVariable("color") final String color, @PathVariable("shape") final String shape) {
		//TODO Add Null check for input params // Logs // exception handling // Response codes
		return Optional.ofNullable(coloredShapeMap.get(color+shape))
				.orElseThrow(RuntimeException::new)
				.getShape();
	}
}
