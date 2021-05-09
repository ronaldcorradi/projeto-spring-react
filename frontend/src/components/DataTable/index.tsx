import axios from "axios";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { SalePage } from "types/sale";
import { formatLocalDate } from "utils/format";
import { BASE_URL } from "utils/requests";

const DataTable = () => {

    const [activePage,setActivePage] = useState(0);

    const [page, setPage] = useState<SalePage>({
        last: true,
        totalElemensts: 0,
        totalPages: 0,
        number: 0,
        first: true
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales?page=${activePage}&size=0`)
            .then(response => {
                setPage(response.data);
            })
    }, [activePage]);

    const changePage = (index: number)=>{
        setActivePage(index);
    }

    return (
        <>
            <Pagination page={page} onPageChange={changePage}/>
            <div className="table-responsive">
                <table className="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>Data</th>
                            <th>Vendedor</th>
                            <th>Clientes visitados</th>
                            <th>Negócios fechados</th>
                            <th>Valor</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(iten => (
                            <tr key={iten.id}>
                                <td>{formatLocalDate(iten.date, "dd/MM/yyyy")}</td>
                                <td>{iten.seller.name}</td>
                                <td>{iten.visited}</td>
                                <td>{iten.deals}</td>
                                <td>{iten.amount.toFixed(2)}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </>
    )
}
export default DataTable;