package be.feelio.mollie.data.links;

import be.feelio.mollie.data.common.Link;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CaptureLinks {

    private Link self;

    private Link payment;

    private Optional<Link> settlement;

    private Optional<Link> shipment;

    private Link documentation;

}
