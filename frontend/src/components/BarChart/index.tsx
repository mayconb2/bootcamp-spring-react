import axios from 'axios';
import { useEffect } from 'react';
import { useState } from 'react';
import Chart from 'react-apexcharts';
import { SaleSuccess } from 'types/sales';
import { round } from 'utils/format';
import { BASE_URL } from 'utils/requests';

type SeriesData = {
    name: string,
    data: number[]
}

type ChartData = {
    labels: {
        categories: string[]
    },
    series: SeriesData[]
}

const BarChart = () => {

    const [chartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []
            }
        ]
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/success-by-seller`)
            .then(response => {
                const data = response.data as SaleSuccess[];
                const myCategories = data.map(seller => seller.sellerName);
                const mySeries = data.map(seller => round(100 * seller.deals / seller.visites, 1));

                setChartData({
                    labels: {
                        categories: myCategories
                    },
                    series: [
                        {
                            name: "% Success",
                            data: mySeries
                        }
                    ]
                });

            });
    }, [])

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    return (
        <Chart
            options={{ ...options, xaxis: chartData.labels }}
            series={chartData.series}
            type='bar'
            height='230'
        />
    );
}

export default BarChart;