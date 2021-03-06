package org.hexworks.zircon.api.builder.component

import org.hexworks.zircon.api.component.Slider
import org.hexworks.zircon.api.component.base.BaseComponentBuilder
import org.hexworks.zircon.api.component.data.CommonComponentProperties
import org.hexworks.zircon.api.component.data.ComponentMetadata
import org.hexworks.zircon.api.component.renderer.ComponentRenderer
import org.hexworks.zircon.api.component.renderer.impl.DefaultComponentRenderingStrategy
import org.hexworks.zircon.internal.component.impl.DefaultHorizontalSlider
import org.hexworks.zircon.internal.component.renderer.HorizontalSliderRenderer
import kotlin.jvm.JvmStatic
import kotlin.math.max

@Suppress("UNCHECKED_CAST")
/**
 * Builder for the slider. By default, it creates a slider with a maxValue of 100 and 10 steps.
 */
data class HorizontalSliderBuilder(
        private var minValue: Int = 0,
        private var maxValue: Int = 100,
        private var numberOfSteps: Int = 10,
        private var additionalWidthNeeded: Int = 5,
        override var props: CommonComponentProperties<Slider> = CommonComponentProperties(
                componentRenderer = HorizontalSliderRenderer()))
    : BaseComponentBuilder<Slider, HorizontalSliderBuilder>() {

    fun withMaxValue(max: Int) = also {
        require(max > minValue) { "Max value must be greater than min value"}
        this.maxValue = max
    }

    fun withMinValue(min: Int) = also {
        require(min > 0) { "Min value must be greater than 0"}
        require(min < maxValue) {"Min value must be smaller than max value"}
        this.minValue = min
    }

    fun withNumberOfSteps(steps: Int) = also {
        this.numberOfSteps = steps
        contentSize = contentSize
                .withWidth(max(steps + 1, contentSize.width))
    }

    override fun build(): Slider = DefaultHorizontalSlider(
                componentMetadata = ComponentMetadata(
                        size = size,
                        relativePosition = position,
                        componentStyleSet = componentStyleSet,
                        tileset = tileset),
                minValue = minValue,
                maxValue = maxValue,
                numberOfSteps = numberOfSteps,
                renderingStrategy = DefaultComponentRenderingStrategy(
                        decorationRenderers = decorationRenderers,
                        componentRenderer = props.componentRenderer as ComponentRenderer<Slider>))

    override fun createCopy() = copy(props = props.copy())

    companion object {

        @JvmStatic
        fun newBuilder() = HorizontalSliderBuilder()
    }
}
